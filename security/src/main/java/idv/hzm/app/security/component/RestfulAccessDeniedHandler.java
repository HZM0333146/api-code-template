package idv.hzm.app.security.component;

// import cn.hutool.json.JSONUtil;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import idv.hzm.app.common.util.JSONUtil;
import idv.hzm.app.common.api.CommonResult;

/**
 * 自定義返回結果：沒有權限訪問時
 */
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
  @Override
  public void handle(HttpServletRequest request, HttpServletResponse response,
      AccessDeniedException e) throws IOException, ServletException {
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Cache-Control", "no-cache");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("application/json");
    response.getWriter().println(JSONUtil.parse(CommonResult.forbidden(e.getMessage())));
    response.getWriter().flush();
  }
}
