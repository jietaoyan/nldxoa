<template>
  <div>
    <div class="shang">
      <div class="zuo">
        <div class="titu">
          <img class="tu" src="../../assets/u1971.svg" alt="" />空调
        </div>
        <div class="kong">
          <!-- 空调温度加 -->
          <span class="iconfont icon-jia" @click.prevent="jiawendu"></span>
          <el-progress
            type="circle"
            :show-text="false"
            :color="'#00c0ff'"
            :stroke-width="10"
            :percentage="kongwenbi"
          ></el-progress>
          <span class="iconfont icon-jian" @click.prevent="jianwendu"></span>
          <div class="zhongzhi">{{ kongwen }}℃</div>
        </div>
        <div class="tubiao">
          <span
            class="quan"
            :class="{ quan2: kongtiaolei == 1 }"
            @click.prevent="dain1"
          >
            <span class="iconfont icon-taiyang"></span>
          </span>
          <span
            class="quan"
            :class="{ quan2: kongtiaolei == 2 }"
            @click.prevent="dain2"
          >
            <span class="iconfont icon-snow"></span>
          </span>
          <span
            class="quan"
            :class="{ quan2: kongtiaolei == 3 }"
            @click.prevent="dain3"
          >
            <span class="iconfont icon-fengshan1"></span>
          </span>
          <span
            class="quan"
            :class="{ quan2: kongtiaolei == 4 }"
            @click.prevent="dain4"
          >
            <span class="iconfont icon-ink14"></span>
          </span>
        </div>
        <div
          class="kaiguan"
          :class="{ kaiguan2: kongkai }"
          @click.prevent="dain5"
        >
          <span class="iconfont icon-weibiaoti--"></span>
        </div>
      </div>
      <div class="you">
        <div class="titu">
          <img class="tu" src="../../assets/u1971.svg" alt="" />16A插座
        </div>
        <!-- 折线图上标题 -->
        <div class="tuti">
          <div class="tan">
            <div class="tamyi"><span>电流</span> <i class="dianliu">5A</i></div>
            <div class="tamyi">
              <span>电压</span> <i class="dianya">220V</i>
            </div>
            <div class="tamyi">
              <span>负载功率</span> <i class="fuzai">36W</i>
            </div>
            <div class="tamyi">
              <span>总耗电量</span> <i class="haodian">36KWH</i>
            </div>
            <div class="tamyi">
              <span>开关状态 </span
              ><el-switch v-model="kanvalue1" @change="kanvalue161">
              </el-switch>
            </div>
            <div class="tamyi">
              <span>童锁开关 </span
              ><el-switch v-model="kanvalue2" @change="kanvalue162">
              </el-switch>
            </div>
          </div>
          <div class="tan">
            <div
              class="tamyi2"
              :class="{ tamyi22: cazuo16 == 1 }"
              @click.prevent="diantian1"
            >
              最近1天
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: cazuo16 == 2 }"
              @click.prevent="diantian2"
            >
              最近1周
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: cazuo16 == 3 }"
              @click.prevent="diantian3"
            >
              最近30天
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: cazuo16 == 4 }"
              @click.prevent="diantian4"
            >
              最近1年
            </div>
          </div>
        </div>
        <!-- 折线图 -->
        <div id="myChart"></div>
        <div class="di">
          <i class="xianse1"></i> 电流 <i class="xianse2"></i>电压
          <i class="xianse3"></i>耗电量
        </div>
      </div>
    </div>
    <!-- 中 -->
    <div class="shang">
      <div class="zuo">
        <div class="titu">
          <img class="tu" src="../../assets/u1971.svg" alt="" />照明开关
        </div>
        <div class="dengguan">
          <div class="anni">
            一路：
            <img
              class="antu"
              v-if="kan"
              src="../../assets/img/kai.png"
              @click.prevent="kan = !kan"
            />
            <img
              class="antu"
              v-if="!kan"
              src="../../assets/img/guan.png"
              @click.prevent="kan = !kan"
            />
          </div>
          <div class="anni">
            二路：
            <img
              class="antu"
              v-if="kan2"
              src="../../assets/img/kai.png"
              @click.prevent="kan2 = !kan2"
            />
            <img
              class="antu"
              v-if="!kan2"
              src="../../assets/img/guan.png"
              @click.prevent="kan2 = !kan2"
            />
          </div>
          <div class="anni">
            三路：
            <img
              class="antu"
              v-if="kan3"
              src="../../assets/img/kai.png"
              @click.prevent="kan3 = !kan3"
            />
            <img
              class="antu"
              v-if="!kan3"
              src="../../assets/img/guan.png"
              @click.prevent="kan3 = !kan3"
            />
          </div>
        </div>
      </div>
      <div class="you">
        <div class="youti">
          <div class="titu">
            <img class="tu" src="../../assets/u1971.svg" alt="" />10A插座
          </div>
          <div>
            <span
              class="tamyi4"
              :class="{ tamyi42: cazuohao == 1 }"
              @click.prevent="cazuohao1"
              >1号</span
            >
            <span
              class="tamyi4"
              :class="{ tamyi42: cazuohao == 2 }"
              @click.prevent="cazuohao2"
              >2号</span
            >
          </div>
        </div>

        <!-- 折线图上标题 -->
        <div class="tuti">
          <div class="tan">
            <div class="tamyi"><span>电流</span> <i class="dianliu">5A</i></div>
            <div class="tamyi">
              <span>电压</span> <i class="dianya">220V</i>
            </div>
            <div class="tamyi">
              <span>负载功率</span> <i class="fuzai">36W</i>
            </div>
            <div class="tamyi">
              <span>总耗电量</span> <i class="haodian">36KWH</i>
            </div>
            <div class="tamyi">
              <span>开关状态 </span
              ><el-switch v-model="kanvalue3" @change="kanvalue101">
              </el-switch>
            </div>
            <div class="tamyi">
              <span>童锁开关 </span
              ><el-switch v-model="kanvalue4" @change="kanvalue102">
              </el-switch>
            </div>
          </div>
          <div class="tan">
            <div
              class="tamyi2"
              :class="{ tamyi22: cazuo10 == 1 }"
              @click.prevent="diantian101"
            >
              最近1天
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: cazuo10 == 2 }"
              @click.prevent="diantian102"
            >
              最近1周
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: cazuo10 == 3 }"
              @click.prevent="diantian103"
            >
              最近30天
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: cazuo10 == 4 }"
              @click.prevent="diantian104"
            >
              最近1年
            </div>
          </div>
        </div>
        <!-- 折线图 -->
        <div id="myChart2"></div>
        <div class="di">
          <i class="xianse1"></i> 电流 <i class="xianse2"></i>电压
          <i class="xianse3"></i>耗电量
        </div>
      </div>
    </div>
    <!-- 下 -->
    <div class="shang2">
      <div class="zuo">
        <div class="titu">
          <img class="tu" src="../../assets/u1971.svg" alt="" />烟感
        </div>
        <div class="yangan">
          <el-progress
            type="circle"
            :color="'#00c0ff'"
            :stroke-width="10"
            :percentage="80"
          ></el-progress>
          <div class="diantishi">剩余电量</div>
        </div>
        <div class="baojing">
          是否有警报：<span class="shi">是</span
          ><span class="iconfont icon-iconfontcolor100-copy"></span>
        </div>
      </div>
      <div class="you">
        <div class="titu">
          <img class="tu" src="../../assets/u1971.svg" alt="" />温湿度
        </div>
        <!-- 折线图上标题 -->
        <div class="tuti">
          <div class="tan">
            <div class="tamyi">
              <span>当前温度</span> <i class="dianliu">5A</i>
            </div>
            <div class="tamyi">
              <span>当前湿度</span> <i class="dianya">220V</i>
            </div>
            <div class="tamyi">
              <span>剩余电量</span> <i class="fuzai">36W</i>
            </div>
          </div>
          <div class="tan">
            <div
              class="tamyi2"
              :class="{ tamyi22: wenshitian == 1 }"
              @click.prevent="wenshi1"
            >
              最近1天
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: wenshitian == 2 }"
              @click.prevent="wenshi2"
            >
              最近1周
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: wenshitian == 3 }"
              @click.prevent="wenshi3"
            >
              最近30天
            </div>
            <div
              class="tamyi2"
              :class="{ tamyi22: wenshitian == 4 }"
              @click.prevent="wenshi4"
            >
              最近1年
            </div>
          </div>
        </div>
        <!-- 折线图 -->
        <div id="myChart3"></div>
        <div class="di">
          <i class="xianse1"></i> 温度 <i class="xianse2"></i>湿度
        </div>
      </div>
    </div>
  </div>
</template>

<script>
//这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
//例如：import 《组件名称》 from '《组件路径》'
import * as echarts from "echarts";
export default {
  //import引入的组件需要注入到对象中才能使用
  components: {},
  props: {},
  data() {
    //这里存放数据
    return {
      kongwen: 16, //空调的初始温度
      kongwenbi: 0, //空调温度%
      kongtiaolei: 0, //空调类型
      kongkai: false, //空调开关

      kanvalue1: true, //16A开关
      kanvalue2: true, //16A童锁
      cazuo16: 1, //16A天数

      kan: true, //照明开关
      kan2: true,
      kan3: true,

      cazuohao: 1, //10A插座 1号和2号
      kanvalue3: true, //10A开关
      kanvalue4: true, //10A童锁
      cazuo10: 1, //10A天数

      wenshitian: 1, //温湿度天数
    };
  },
  //计算属性 类似于data概念
  computed: {},
  //监控data中的数据变化
  watch: {},
  //方法集合
  methods: {
    // 16A插座
    drawLine() {
      // 基于准备好的dom，初始化echarts实例
      let myChart = echarts.init(document.getElementById("myChart"));
      myChart.clear();
      myChart.resize();
      // 绘制图表
      myChart.setOption({
        tooltip: {
          trigger: "axis",
          // axisPointer: {
          //   type: "cross",
          //   label: {
          //     backgroundColor: "#6a7985",
          //   },
          // },
        },
        grid: {
          left: "3%",
          right: "4%",
          bottom: "3%",
          containLabel: true,
        },
        // toolbox: {
        //   feature: {
        //     saveAsImage: {},
        //   },
        // },
        xAxis: [
          {
            type: "category",
            boundaryGap: false,
            data: ["周一", "周二", "周三", "周四", "周五", "周六", "周日"],
          },
        ],
        yAxis: [
          {
            type: "value",
          },
        ],
        series: [
          {
            name: "电流",
            type: "line",
            stack: "总量",
            // areaStyle: {
            //   normal: {
            //     color: "#227fdf"
            //   },
            // },
            // emphasis: {
            //   focus: "series",
            // },
            itemStyle: {
              normal: {
                color: "#227fdf",
                lineStyle: {
                  color: "#227fdf",
                },
              },
            },
            data: [220, 182, 191, 234, 290, 330, 310],
          },
          {
            name: "电压",
            type: "line",
            stack: "总量",
            // areaStyle: {
            //   normal: {
            //     color: "#00c0ff"
            //   },
            // },
            // emphasis: {
            //   focus: "series",
            // },
            itemStyle: {
              normal: {
                color: "#00c0ff",
                lineStyle: {
                  color: "#00c0ff",
                },
              },
            },
            data: [150, 232, 201, 154, 190, 330, 410],
          },
          {
            name: "耗电量",
            type: "line",
            stack: "总量",
            // areaStyle: {
            //   normal: {
            //     color: "#FFA119"
            //   },
            // },
            // emphasis: {
            //   focus: "series",
            // },
            itemStyle: {
              normal: {
                color: "#FFA119",
                lineStyle: {
                  color: "#FFA119",
                },
              },
            },
            data: [320, 332, 301, 334, 390, 330, 320],
          },
        ],
      });
    },
    // 10A插座
    drawLine2() {
      // 基于准备好的dom，初始化echarts实例
      let myChart = echarts.init(document.getElementById("myChart2"));
      myChart.clear();
      myChart.resize();
      // 绘制图表
      myChart.setOption({
        tooltip: {
          trigger: "axis",
          // axisPointer: {
          //   type: "cross",
          //   label: {
          //     backgroundColor: "#6a7985",
          //   },
          // },
        },
        grid: {
          left: "3%",
          right: "4%",
          bottom: "3%",
          containLabel: true,
        },
        // toolbox: {
        //   feature: {
        //     saveAsImage: {},
        //   },
        // },
        xAxis: [
          {
            type: "category",
            boundaryGap: false,
            data: ["周一", "周二", "周三", "周四", "周五", "周六", "周日"],
          },
        ],
        yAxis: [
          {
            type: "value",
          },
        ],
        series: [
          {
            name: "电流",
            type: "line",
            stack: "总量",
            // areaStyle: {
            //   normal: {
            //     color: "#227fdf"
            //   },
            // },
            // emphasis: {
            //   focus: "series",
            // },
            itemStyle: {
              normal: {
                color: "#227fdf",
                lineStyle: {
                  color: "#227fdf",
                },
              },
            },
            data: [220, 182, 191, 234, 290, 330, 310],
          },
          {
            name: "电压",
            type: "line",
            stack: "总量",
            // areaStyle: {
            //   normal: {
            //     color: "#00c0ff"
            //   },
            // },
            // emphasis: {
            //   focus: "series",
            // },
            itemStyle: {
              normal: {
                color: "#00c0ff",
                lineStyle: {
                  color: "#00c0ff",
                },
              },
            },
            data: [150, 232, 201, 154, 190, 330, 410],
          },
          {
            name: "耗电量",
            type: "line",
            stack: "总量",
            // areaStyle: {
            //   normal: {
            //     color: "#FFA119"
            //   },
            // },
            // emphasis: {
            //   focus: "series",
            // },
            itemStyle: {
              normal: {
                color: "#FFA119",
                lineStyle: {
                  color: "#FFA119",
                },
              },
            },
            data: [320, 332, 301, 334, 390, 330, 320],
          },
        ],
      });
    },
    // 温湿度
    drawLine3() {
      // 基于准备好的dom，初始化echarts实例
      let myChart = echarts.init(document.getElementById("myChart3"));
      myChart.clear();
      myChart.resize();
      // 绘制图表
      myChart.setOption({
        tooltip: {
          trigger: "axis",
        },
        grid: {
          left: "3%",
          right: "4%",
          bottom: "3%",
          containLabel: true,
        },
        xAxis: [
          {
            type: "category",
            boundaryGap: false,
            data: ["周一", "周二", "周三", "周四", "周五", "周六", "周日"],
          },
        ],
        yAxis: [
          {
            type: "value",
          },
        ],
        series: [
          {
            name: "温度",
            type: "line",
            stack: "总量",
            itemStyle: {
              normal: {
                color: "#227fdf",
                lineStyle: {
                  color: "#227fdf",
                },
              },
            },
            data: [220, 182, 191, 234, 290, 330, 310],
          },
          {
            name: "湿度",
            type: "line",
            stack: "总量",
            itemStyle: {
              normal: {
                color: "#00c0ff",
                lineStyle: {
                  color: "#00c0ff",
                },
              },
            },
            data: [150, 232, 201, 154, 190, 330, 410],
          },
        ],
      });
    },
    //加温度
    jiawendu() {
      if (this.kongwen < 30 && this.kongkai) {
        let a = Number(100 / (30 - 16));
        this.kongwen += 1;
        this.kongwenbi += a;
      }
    },
    // 减温度
    jianwendu() {
      if (this.kongwen > 16 && this.kongkai) {
        let a = Number(100 / (30 - 16));
        this.kongwen -= 1;
        // if(this.kongwenbi>9)
        if (this.kongwen == 16) {
          this.kongwenbi = 0;
        } else {
          this.kongwenbi -= a;
        }
      }
    },
    // 空调类型
    dain1() {
      if (this.kongkai) {
        this.kongtiaolei = 1;
      }
    },
    dain2() {
      if (this.kongkai) {
        this.kongtiaolei = 2;
      }
    },
    dain3() {
      if (this.kongkai) {
        this.kongtiaolei = 3;
      }
    },
    dain4() {
      if (this.kongkai) {
        this.kongtiaolei = 4;
      }
    },
    dain5() {
      this.kongtiaolei = 5;
      this.kongkai = !this.kongkai;
    },
    // 16A开关
    kanvalue161(aa) {
      console.log("161", aa);
    },
    // 16A童锁
    kanvalue162(aa) {
      console.log("162", aa);
    },
    // 16A选天数
    diantian1() {
      this.cazuo16 = 1;
    },
    diantian2() {
      this.cazuo16 = 2;
    },
    diantian3() {
      this.cazuo16 = 3;
    },
    diantian4() {
      this.cazuo16 = 4;
    },
    // 10A插座1号
    cazuohao1() {
      this.cazuohao = 1;
    },
    // 10A插座2号
    cazuohao2() {
      this.cazuohao = 2;
    },
    // 10A开关
    kanvalue101(aa) {
      console.log("101", aa);
    },
    // 10A童锁
    kanvalue102(aa) {
      console.log("102", aa);
    },
    // 10A选天
    diantian101() {
      this.cazuo10 = 1;
    },
    diantian102() {
      this.cazuo10 = 2;
    },
    diantian103() {
      this.cazuo10 = 3;
    },
    diantian104() {
      this.cazuo10 = 4;
    },

    // 温湿度天数
    wenshi1() {
      this.wenshitian = 1;
    },
    wenshi2() {
      this.wenshitian = 2;
    },
    wenshi3() {
      this.wenshitian = 3;
    },
    wenshi4() {
      this.wenshitian = 4;
    },
  },
  //生命周期 - 创建完成（可以访问当前this实例）
  created() {},
  //生命周期 - 挂载完成（可以访问DOM元素）
  mounted() {
    this.drawLine();
    this.drawLine2();
    this.drawLine3();
    window.addEventListener("resize", this.drawLine);
    window.addEventListener("resize", this.drawLine2);
    window.addEventListener("resize", this.drawLine3);

    document
      .querySelector("body")
      .setAttribute("style", "background-color:#f0f4f7;");
  },
  beforeRouteLeave(to, from, next) {
    // 离开页面时取消监听
    window.removeEventListener("resize", this.draw);
    window.removeEventListener("resize", this.draw2);
    window.removeEventListener("resize", this.draw3);
    next();
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
  margin-top: 20px;
  display: flex;
  justify-content: space-evenly;
}
.shang2 {
  margin-top: 20px;
  display: flex;
  justify-content: space-evenly;
  padding-bottom: 30px;
}
.zuo {
  width: 260px;
  height: 250px;
  background-color: #fff;
  padding: 20px;
  border-radius: 5px;
}
.titu {
  width: 100px;
  display: flex;
  font-size: 16px;
  color: #333;
}
.tu {
  margin-right: 5px;
}
.icon-jia {
  font-size: 28px;
  color: #00c0ff;
  margin-right: 15px;
  cursor: pointer;
}
.icon-jian {
  font-size: 28px;
  color: #00c0ff;
  margin-left: 15px;
  cursor: pointer;
}
.kong {
  display: flex;
  justify-content: center;
  align-items: center;
  position: relative;
}
.zhongzhi {
  width: 90px;
  height: 90px;
  background-color: #fff;
  position: absolute;
  top: 18px;
  border-radius: 50%;
  text-align: center;
  line-height: 90px;
  font-size: 31px;
  color: #00c0ff;
  font-weight: 900;
}
.tubiao {
  width: 180px;
  /* background-color: #ccc; */
  display: flex;
  justify-content: space-between;
  margin: 0 auto;
  margin-top: 5px;
}
.quan {
  display: inline-block;
  width: 32px;
  height: 32px;
  background-color: #fff;
  border-radius: 50%;
  text-align: center;
  line-height: 32px;
  border: #8c8c8c solid 1px;
  color: #8c8c8c;
  cursor: pointer;
}
.quan2 {
  background-color: #00c0ff;
  border: #00c0ff solid 1px;
  color: #fff;
}
.quan:hover {
  background-color: #00c0ff;
  border: #00c0ff solid 1px;
  color: #fff;
}

.kaiguan {
  margin: 0 auto;
  margin-top: 8px;
  width: 56px;
  height: 56px;
  background-color: #8c8c8c;
  border-radius: 50%;
  text-align: center;
  line-height: 56px;
  cursor: pointer;
}
.kaiguan2 {
  background-color: #00c0ff;
  color: #fff;
}
/* .kaiguan:hover {
  background-color: #00c0ff;
  color: #fff;
} */

.icon-weibiaoti-- {
  font-size: 26px;
  color: #fff;
  cursor: pointer;
}
.you {
  width: calc(100% - 400px);
  min-width: 1100px;
  height: 250px;
  background-color: #fff;
  padding: 20px;
  border-radius: 5px;
}
.tuti {
  margin: 8px 0 0 5px;
  justify-content: space-between;
  display: flex;
  font-size: 14px;
}
.tan {
  display: flex;
  z-index: 3;
}
.tamyi {
  margin-left: 20px;
}
.tamyi2 {
  z-index: 3;
  margin-left: 20px;
}
.tamyi22 {
  color: #00c0ff;
  cursor: pointer;
}
.tamyi2:hover {
  color: #00c0ff;
  cursor: pointer;
}
.dianliu {
  color: rgb(245, 154, 35);
}
.dianya {
  color: #7786ff;
}
.fuzai {
  color: #00bfbf;
}
.haodian {
  color: rgb(204, 102, 176);
}
#myChart {
  /* min-width: 1100px;*/
  width: 100%;

  height: 90%;
  margin-top: -30px;
}
#myChart2 {
  width: 100%;
  height: 90%;
  margin-top: -30px;
}
#myChart3 {
  width: 100%;
  height: 90%;
  margin-top: -30px;
}
.xianse1 {
  display: inline-block;
  width: 10px;
  height: 5px;
  background-color: #227fdf;
}
.xianse2 {
  display: inline-block;
  width: 10px;
  height: 5px;
  background-color: #00c0ff;
}
.xianse3 {
  display: inline-block;
  width: 10px;
  height: 5px;
  background-color: #ffa119;
}
.di {
  font-size: 12px;
  text-align: center;
  color: #666;
}
.dengguan {
  width: 80%;
  height: 80%;
  margin: 0 auto;
  margin-top: 20px;
  font-size: 16px;
  color: #666;
  line-height: 60px;
}
.anni {
  display: flex;
}
.antu {
  width: 110px;
  height: 40px;
  margin-top: 12px;
  cursor: pointer;
}
.youti {
  display: flex;
  justify-content: space-between;
}
.tamyi4 {
  display: inline-block;
  width: 70px;
  height: 26px;
  border: 1px solid #ccc;
  border-radius: 2px;
  text-align: center;
  line-height: 26px;
  cursor: pointer;
}
.tamyi4:hover {
  border: 1px solid #00c0ff;
  color: #00c0ff;
}
.tamyi42 {
  border: 1px solid #00c0ff;
  color: #00c0ff;
}
.yangan {
  width: 80%;
  height: 62%;
  margin: 0 auto;
  margin-top: 15px;
  text-align: center;
}
.baojing {
  /* width: 0%; */
  text-align: center;
}
.diantishi {
  margin-top: -50px;
  font-size: 12px;
  color: #666;
}
.icon-iconfontcolor100-copy,
.shi {
  color: #ffa119;
}
</style>
