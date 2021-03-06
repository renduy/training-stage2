package net.work100.training.stage2.iot.cloud.web.admin.web.interceptor;

import net.work100.training.stage2.iot.cloud.commons.constant.ConstantUtils;
import net.work100.training.stage2.iot.cloud.domain.AuthManager;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>Title: PermissionInterceptor</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/monolithic-project-iot-cloud-admin.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-20 21:16
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-20   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView != null && "login".equals(modelAndView.getViewName())) {
            AuthManager authManager = (AuthManager) request.getSession().getAttribute(ConstantUtils.SESSION_MANAGER);
            if (authManager != null) {
                response.sendRedirect("/main");
            }
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
