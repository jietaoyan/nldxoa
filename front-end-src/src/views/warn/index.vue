<template>
  <div>
    <div class="shang">
      <!-- 告警 -->
      <div class="zuo">
        <div class="zuoti">
          <div class="titu">
            <img class="tu" src="../../assets/u1971.svg" alt="" /> 空间告警排行
          </div>
          <div>
            <span
              class="zhi"
              :class="{ zhi2: konggao == 1 }"
              @click.prevent="konggao1"
              >最近1天</span
            >
            <span
              class="zhi"
              :class="{ zhi2: konggao == 2 }"
              @click.prevent="konggao2"
              >最近1周</span
            >
            <span
              class="zhi"
              :class="{ zhi2: konggao == 3 }"
              @click.prevent="konggao3"
              >最近30天</span
            >
            <span
              class="zhi"
              :class="{ zhi2: konggao == 4 }"
              @click.prevent="konggao4"
              >最近1年</span
            >
          </div>
        </div>
        <!-- 表格 -->
        <div class="zuoxia">
          <el-table
            :data="liarr"
            style="width: 100%"
            border
            :cell-style="{ textAlign: 'center' }"
            :header-cell-style="{
              backgroundColor: '#f1f3f5',
              color: '#555',
              textAlign: 'center',
            }"
          >
            <el-table-column label="排名" show-overflow-tooltip>
              <template slot-scope="scope">
                <span> {{ scope.row.a }}</span>
              </template>
            </el-table-column>
            <el-table-column label="机房名称" show-overflow-tooltip>
              <template slot-scope="scope">
                <span>{{ scope.row.b }}</span>
              </template>
            </el-table-column>
            <el-table-column label="设备总数" show-overflow-tooltip>
              <template slot-scope="scope">
                <span>{{ scope.row.b }}</span>
              </template>
            </el-table-column>
            <el-table-column label="告警总数" show-overflow-tooltip>
              <template slot-scope="scope">
                <span>{{ scope.row.b }}</span>
              </template>
            </el-table-column>
          </el-table>
        </div>
      </div>
      <!-- 用电 -->
      <div class="you">
        <div class="zuoti">
          <div class="titu">
            <img class="tu" src="../../assets/u1971.svg" alt="" />
            空间的用电量排名
          </div>
          <div>
            <span
              class="zhi"
              :class="{ zhi2: kongdian == 1 }"
              @click.prevent="daintina1"
              >最近1天</span
            >
            <span
              class="zhi"
              :class="{ zhi2: kongdian == 2 }"
              @click.prevent="daintina2"
              >最近1周</span
            >
            <span
              class="zhi"
              :class="{ zhi2: kongdian == 3 }"
              @click.prevent="daintian3"
              >最近30天</span
            >
          </div>
        </div>
        <div id="myChart" :style="{ width: '700px', height: '400px' }"></div>
      </div>
    </div>

    <div class="xia">
      <!-- 查询 -->
      <el-form :inline="true" class="demo-form-inline">
        <el-form-item label="设备名称:">
          <el-input size="medium"></el-input>
        </el-form-item>

        <el-form-item label="设备类型:">
          <el-select v-model="value" size="medium" placeholder="请选择">
            <el-option
              v-for="item in options"
              :key="item.value"
              :label="item.label"
              :value="item.value"
            >
            </el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="告警时间:">
          <el-input size="medium"></el-input>
        </el-form-item>

        <el-form-item>
          <el-button size="medium" class="caxun">查询</el-button>
        </el-form-item>
      </el-form>
      <!-- 表格 -->
      <el-table
        :data="liarr"
        style="width: 100%"
        border
        :cell-style="{ textAlign: 'center' }"
        :header-cell-style="{
          backgroundColor: '#f1f3f5',
          color: '#555',
          textAlign: 'center',
        }"
      >
        <el-table-column label="设备名称" show-overflow-tooltip>
          <template slot-scope="scope">
            <span> {{ scope.row.a }}</span>
          </template>
        </el-table-column>
        <el-table-column label="设备序列号" show-overflow-tooltip>
          <template slot-scope="scope">
            <span>{{ scope.row.b }}</span>
          </template>
        </el-table-column>
        <el-table-column label="设备类型" show-overflow-tooltip>
          <template slot-scope="scope">
            <span>{{ scope.row.b }}</span>
          </template>
        </el-table-column>
        <el-table-column label="告警内容" show-overflow-tooltip>
          <template slot-scope="scope">
            <span>{{ scope.row.b }}</span>
          </template>
        </el-table-column>
        <el-table-column label="位置信息" show-overflow-tooltip>
          <template slot-scope="scope">
            <span>{{ scope.row.b }}</span>
          </template>
        </el-table-column>
        <el-table-column label="告警时间" show-overflow-tooltip>
          <template slot-scope="scope">
            <span>{{ scope.row.b }}</span>
          </template>
        </el-table-column>
        <el-table-column label="恢复时间" show-overflow-tooltip>
          <template slot-scope="scope">
            <span>{{ scope.row.b }}</span>
          </template>
        </el-table-column>
      </el-table>
      <!-- 分页 -->
      <div class="block">
        <el-pagination
          background
          @current-change="handleCurrentChange"
          :current-page.sync="currentPage1"
          :page-size="100"
          layout="prev, pager, next, jumper"
          :total="1000"
        >
        </el-pagination>
      </div>
    </div>
  </div>
</template>

<script>
//这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
//例如：import 《组件名称》 from '《组件路径》';
import * as echarts from "echarts";
export default {
  //import引入的组件需要注入到对象中才能使用
  components: {},
  props: {},
  data() {
    //这里存放数据
    return {
      konggao: 1, //空间告警天数
      kongdian: 1, //空间用电天数
      liarr: [
        {
          a: "111",
          b: "22222222222222222222222222",
        },
        {
          a: "111",
          b: "22222222222222222222222222",
        },
        {
          a: "111",
          b: "22222222222222222222222222",
        },
        {
          a: "111",
          b: "22222222222222222222222222",
        },
        {
          a: "111",
          b: "22222222222222222222222222",
        },
        {
          a: "111",
          b: "22222222222222222222222222",
        },
      ],
      value: "", //设备类型
      options: [], //类型数组
      currentPage1: 1, //默认第1页
    };
  },
  //计算属性 类似于data概念
  computed: {},
  //监控data中的数据变化
  watch: {},
  //方法集合
  methods: {
    //空间告警天数
    konggao1() {
      this.konggao = 1;
    },
    konggao2() {
      this.konggao = 2;
    },
    konggao3() {
      this.konggao = 3;
    },
    konggao4() {
      this.konggao = 4;
    },
    // 用电天数
    daintina1() {
      this.kongdian = 1;
    },
    daintina2() {
      this.kongdian = 2;
    },
    daintian3() {
      this.kongdian = 3;
    },

    // 柱状图
    drawLine() {
      // 基于准备好的dom，初始化echarts实例
      let myChart = echarts.init(document.getElementById("myChart"));
      // 绘制图表
      myChart.setOption({
        color: ["rgb(53, 151, 255)"], //柱状图颜色
        title: { text: "" },
        tooltip: {},
        xAxis: {
          // data: ["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"],
          axisLine: {
            lineStyle: {
              color: "#444",
            },
          },
        },
        yAxis: {
          type: "category",
          data: ["A", "B", "C", "D", "E"],
          inverse: true,
          splitLine: {
            lineStyle: {
              // 使用深浅的间隔色
              color: ["#444"],
            },
          },
          nameTextStyle: {
            color: ["#444"],
          },
          axisLine: {
            lineStyle: {
              color: "#444",
            },
          },
        },
        series: [
          {
            name: "销量",
            type: "bar",
            data: [5, 20, 36, 10, 10, 20],
          },
        ],
      });
    },
    // 查询

    // 分页
    handleCurrentChange(val) {
      console.log(`当前页: ${val}`);
    },
  },
  //生命周期 - 创建完成（可以访问当前this实例）
  created() {},
  //生命周期 - 挂载完成（可以访问DOM元素）
  mounted() {
    this.drawLine();
    document
      .querySelector("body")
      .setAttribute("style", "background-color:#f0f4f7;");
  },
  beforeCreate() {}, //生命周期 - 创建之前
  beforeMount() {}, //生命周期 - 挂载之前
  beforeUpdate() {}, //生命周期 - 更新之前
  updated() {}, //生命周期 - 更新之后
  beforeDestroy() {
    document.querySelector("body").removeAttribute("style");
  }, //生命周期 - 销毁之前
  destroyed() {}, //生命周期 - 销毁完成
  activated() {}, //如果页面有keep-alive缓存功能，这个函数会触发
};
</script>
<style scoped>
.shang {
  height: 450px;
  display: flex;
  justify-content: space-around;
  margin-top: 20px;
}
.zuo {
  width: 45%;
  min-width: 680px;
  height: 400px;
  background-color: #fff;
  padding: 20px;
}
.zuoti {
  display: flex;
  justify-content: space-between;
}
.titu {
  display: flex;
  font-size: 16px;
  color: #333;
}
.tu {
  margin-right: 5px;
}
.zhi {
  font-size: 13px;
  color: #555;
  margin-left: 20px;
  cursor: pointer;
}
.zhi2 {
  color: rgba(53, 151, 255, 1);
}
.zhi:hover {
  color: #00c0ff;
}
.zuoxia {
  margin-top: 25px;
}
.you {
  width: 45%;
  min-width: 680px;
  height: 400px;
  background-color: #fff;
  padding: 20px;
}
.xia {
  width: 95%;
  min-width: 1320px;
  background-color: #fff;
  margin: 0 auto;
  padding: 20px;
}
.block {
  margin: 20px 0;
}
.caxun {
  width: 95px;
  color: #fff;
  background-color: rgba(53, 151, 255, 1);
}
.el-form-item__label {
  color: red;
}
</style>
