<template>
  <div class="wai">
    <div class="shang">
      <div class="log">农林大学</div>
      <div class="zhong">
        <el-menu
          class="tou"
          mode="horizontal"
          :default-active="activeIndex"
          @select="handleSelect"
          text-color="#fff"
          background-color="#232026"
          active-text-color="#3597FF"
          ><router-link to="/home">
            <el-menu-item index="1"> 空间列表 </el-menu-item> </router-link
          ><router-link to="/home/warn">
            <el-menu-item index="2"> 告警中心 </el-menu-item></router-link
          >
          <router-link to="/home/organize">
            <el-menu-item index="3"> 组织人员 </el-menu-item>
          </router-link>
        </el-menu>
      </div>

      <div class="ren">
        <el-dropdown>
          <span class="el-dropdown-link">
            人名<i class="el-icon-arrow-down el-icon--right"></i>
          </span>
          <el-dropdown-menu slot="dropdown" class="xian">
            <el-dropdown-item>基本资料</el-dropdown-item>
            <el-dropdown-item>修改密码</el-dropdown-item>
            <el-dropdown-item>退出</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </div>
    </div>
    <div>
      <router-view />
    </div>
  </div>
</template>

<script>
//这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
//例如：import 《组件名称》 from '《组件路径》';
import Cookies from "js-cookie";
export default {
  //import引入的组件需要注入到对象中才能使用
  components: {},
  props: {},
  data() {
    //这里存放数据
    return {
      activeIndex: "1",
    };
  },
  //计算属性 类似于data概念
  computed: {},
  //监控data中的数据变化
  watch: {},
  //方法集合
  methods: {
    // 获取当前所选择的菜单
    getid() {
      if (Cookies.get("id")) {
        this.activeIndex = String(Cookies.get("id"));
      } else {
        this.activeIndex = "1";
      }
    },
    // 保存当前所选的菜单栏
    handleSelect(key) {
      Cookies.set("id", key);
    },
    // //跳转
    // kong(){
    //   this.$router.push({
    //     path: "/home/space",
    //   });
    // },
  },
  //生命周期 - 创建完成（可以访问当前this实例）
  created() {
    this.getid();
  },
  //生命周期 - 挂载完成（可以访问DOM元素）
  mounted() {},
  beforeCreate() {}, //生命周期 - 创建之前
  beforeMount() {}, //生命周期 - 挂载之前
  beforeUpdate() {}, //生命周期 - 更新之前
  updated() {}, //生命周期 - 更新之后
  beforeDestroy() {}, //生命周期 - 销毁之前
  destroyed() {}, //生命周期 - 销毁完成
  activated() {}, //如果页面有keep-alive缓存功能，这个函数会触发
};
</script>
<style scoped>
.tou {
  display: flex;
  border-bottom: solid 1px #000;
}
.wai {
  min-width: 1500px;
}
.shang {
  width: 100%;
  min-width: 1500px;
  height: 60px;
  display: flex;
  justify-content: space-between;
  background-color: #000;
  color: #fff;
}
.log {
  width: 180px;
  height: 60px;
  line-height: 60px;
  text-align: center;
  color: #3597ff;
}
.ren {
  width: 120px;
  line-height: 60px;
}
.zhong {
  width: calc(100% - 330px);
}
.el-dropdown-link {
  cursor: pointer;
  color: #fff;
}
.el-icon-arrow-down {
  font-size: 12px;
}
.xian {
  width: 100px;
  text-align: center;
}
/* .iconfont{
  color: #FFA71A;
} */
</style>
