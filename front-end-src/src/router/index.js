import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    redirect: "/logon",
  },
  {
    path: "/logon", //登录
    name: "Logon",
    component: () => import("../views/signin/logon.vue"),
  },
  {
    path: "/home", //首页
    name: "Home",
    redirect: "/home/space",
    component: () => import("../views/home/index.vue"),
    children: [
      {
        path: "space", //空间列表
        name: "Space",
        component: () => import("../views/space/index.vue"),
      },
      {
        path: "space/detailed", //详情
        name: "Detailed",
        component: () => import("../views/space/detailed.vue"),
      },
      {
        path: "warn", //告警中心
        name: "Warn",
        component: () => import("../views/warn/index.vue"),
      },
      {
        path: "organize", //组织人员
        name: "Organize",
        component: () => import("../views/organize/index.vue"),
      },
    ],
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
