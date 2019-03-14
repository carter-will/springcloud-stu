package com.carter.wikisc.eurekaservercluster.config;

//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * 由于Spring Cloud 2.0 以上的security默认启用了csrf检验，要在eurekaServer端配置security的csrf检验为false。
 * 否则会报错com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server
 * ---------------------
 */
//@EnableWebSecurity
public class CsrfSecurityConfig/* extends WebSecurityConfigurerAdapter*/ {
/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http); // 这一句必须要加上的，否则直接关闭密码验证服务了
    }*/

}
