package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.User;

/*
 * @RequstParam value用来指定要传入值的id名称，required用来指示参数是否必须绑定 defaultValue 默认值
 * @RequestBody 处理Content-Type: 不是application/x-www-form-urlencoded编码的内容，需要jackson相关jar包
 */
@Controller
public class DemoController {

	@RequestMapping("demo4/{id}/{name}")
	public String demo4(@PathVariable String name, @PathVariable("id") int id, HttpServletRequest req) {
		req.setAttribute("name", name);
		return "NewFile";
	}

	@RequestMapping(value="demo6",produces="text/html; charset=utf-8")
	@ResponseBody
	public String demo6() {

		return "中文乱码解决";
	}

	@RequestMapping("demo7")
	@ResponseBody
	public User demo7() {
		User user = new User();
		user.setAge(12);
		return user;
	}

	@RequestMapping("demo8")
	public void demo8(HttpServletResponse rep) throws IOException {
		PrintWriter out = rep.getWriter();
		out.print("void");
		out.flush();
		out.close();
	}

	@RequestMapping("demo9")
	public String demo9() {
		System.out.println("重定向");
		return "redirect:/NewFile.jsp";
	}
}