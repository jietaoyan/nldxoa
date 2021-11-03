<template>
  <div class="wai">
    <div class="lower">
      <div class="left">
        <el-tree
          class="tree"
          :data="data"
          :props="defaultProps"
          @node-click="handleNodeClick"
        ></el-tree>
      </div>
      <div class="right" :style="{ height: gao + 'px' }">
        <div class="search">
          <el-input placeholder="请输入告警属性"></el-input>
          <span class="iconfont icon-sousuo"></span>
        </div>
        <div class="xia">
          <div class="room">
            <div class="clean">
              <div class="roomti">203机房</div>
              <div class="rommzuan" @click.prevent="kan">查看详情 》</div>
            </div>
            <div class="tiao">
              <span class="roomtu">
                <span class="roomkong"> 16A插座 </span><br />
                <span class="roomzai"> 负载 </span
                ><span class="iconfont icon-iconfontcolor100-copy"></span>
              </span>
              <span class="roomtu">
                <span class="roomkong"> 16A插座 </span><br />
                <span class="roomzai"> 负载 </span
                ><span class="iconfont icon-iconfontcolor100-copy"></span>
              </span>
              <span class="roomtu">
                <span class="roomkong"> 16A插座 </span><br />
                <span class="roomzai"> 负载 </span
                ><span class="iconfont icon-iconfontcolor100-copy"></span>
              </span>
              <span class="roomtu">
                <span class="roomkong"> 16A插座 </span><br />
                <span class="roomzai"> 负载 </span
                ><span class="iconfont icon-iconfontcolor100-copy"></span>
              </span>
            </div>
          </div>

          <div class="room"></div>
          <div class="room"></div>
          <div class="room"></div>
          <div class="room"></div>
          <div class="room"></div>
        </div>
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
  </div>
</template>

<script>
//这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
//例如：import 《组件名称》 from '《组件路径》';

export default {
  //import引入的组件需要注入到对象中才能使用
  components: {},
  props: {},
  data() {
    //这里存放数据
    return {
      gao: document.body.clientHeight - 60,
      data: [
        {
          label: "一级 1",
          children: [
            {
              label: "二级 1-1",
              children: [
                {
                  label: "三级 1-1-1",
                  children: [
                    {
                      label: "四级 1-1-1",
                      children: [
                        {
                          label: "五级 1-1-1",
                          children: [
                            {
                              label: "六级 1-1-1",
                              children: [
                                {
                                  label: "七级 1-1-1",
                                },
                              ],
                            },
                          ],
                        },
                      ],
                    },
                  ],
                },
              ],
            },
            {
              label: "二级 1-2",
            },
          ],
        },
      ],
      defaultProps: {
        children: "children",
        label: "label",
      },

      currentPage1: 1,
    };
  },
  //计算属性 类似于data概念
  computed: {},
  //监控data中的数据变化
  watch: {
    gao: {
      immediate: true,
      handler: function (newVal) {
        console.log(newVal);
      },
    },
  },
  //方法集合
  methods: {
    //左导航
    handleNodeClick(data) {
      console.log(data);
    },
    // 分页
    handleCurrentChange(val) {
      console.log(`当前页: ${val}`);
    },
    // 详情
    kan() {
      this.$router.push({
        path: "/home/space/detailed",
      });
    },
  },
  //生命周期 - 创建完成（可以访问当前this实例）
  created() {},
  //生命周期 - 挂载完成（可以访问DOM元素）
  mounted() {
    const that = this;
    window.onresize = () => {
      return (() => {
        window.screenHeight = document.body.clientHeight;
        that.gao = window.screenHeight - 90;
      })();
    };
    document
      .querySelector("body")
      .setAttribute("style", "background-color:rgb(247, 247, 247);");
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
.wai {
  min-height: 100%;
}
.lower {
  display: flex;
}
.left {
  width: 220px;
}
.tree {
  width: 210px;
  padding-top: 10px;
  padding-left: 10px;
}

.right {
  width: calc(100% - 230px);
  min-height: 700px;
  background-color: #fff;
  padding-left: 30px;
  padding-top: 30px;
}
.search {
  display: flex;
  width: 320px;
  height: 38px;
  border: 1px solid #ccc;
  border-radius: 3px;
}
.search >>> .el-input__inner {
  width: 280px;
  height: 35px;
  border: 0;
}
.icon-sousuo {
  font-size: 30px;
  line-height: 40px;
  margin-right: 5px;
  cursor: pointer;
  color: #999;
}
.icon-sousuo:hover {
  color: #333;
}
.xia {
  margin-top: 30px;
  display: flex;
  flex-wrap: wrap;
}
.room {
  width: 270px;
  height: 170px;
  background-color: rgba(242, 242, 242, 1);
  margin-right: 20px;
  margin-bottom: 25px;
  padding: 10px;
  border-radius: 4px;
}
.roomti {
  float: left;
  font-size: 16px;
  font-weight: 900;
  margin-bottom: 6px;
}
.rommzuan {
  float: right;
  font-size: 12px;
  cursor: pointer;
  color: #3577c4;
}
.roomtu {
  display: inline-block;
  width: 102px;
  height: 45px;
  background-color: #fff;
  border-radius: 6px;
  margin: 3px 3px 3px 3px;
  padding: 10px;
}
.tiao {
  /* background-color: antiquewhite; */
  margin-left: 7px;
}
.roomkong {
  display: inline-block;
  font-size: 14px;
  margin-bottom: 8px;
}
.roomzai {
  font-size: 12px;
  color: #ffa71a;
}
.icon-iconfontcolor100-copy {
  color: #ffa71a;
}
</style>
