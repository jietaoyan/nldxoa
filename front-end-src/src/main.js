import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import ElementUI from "element-ui";
import "element-ui/lib/theme-chalk/index.css";
import "../src/assets/reset.css";
import "../src/assets/icon/iconfont.css";
import Cookies from "js-cookie";

// 路由导航守卫 全局
router.beforeEach((to, from, next) => {
  if (Cookies.get("deng")) {
    next();
  } else {
    if (to.path == "/logon") {
      next();
    } else {
      next("/logon");
    }
  }
});
Vue.config.productionTip = false;
Vue.use(ElementUI);
new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount("#app");
