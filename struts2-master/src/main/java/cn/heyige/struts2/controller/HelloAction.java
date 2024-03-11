package cn.heyige.struts2.controller;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {

    // 跟SpringBoot/MVC不同的是 前端传递的参数不是在方法的形参中接受
    // 而是在类的属性中接收前端传递的参数 所以
    // struts2的控制器必须设计为原型模式
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 请求到达此控制器后的执行方法
     *
     * @return {@link String}
     * @throws Exception 例外
     */
    @Override
    public String execute() throws Exception {
        System.out.println("前端传递的用户名是:" + userName);
        // 返回的字串是逻辑视图名[结果result名称]
        return "success";
    }
}
