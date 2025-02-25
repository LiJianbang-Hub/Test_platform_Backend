package com.abang.yudada.model.dto.app;

import lombok.Data;

import java.io.Serializable;


/**OK
 * 创建应用请求    接受前端的接口类,AppAddRequest类旨在捕获用户希望创建新应用时从前端发送的数据。它作为一个容器来封装请求数据，这些数据将由后端处理。
 *当用户在前端填写表单以创建新应用时，表单数据会以HTTP请求的形式发送到后端。后端将此请求映射到AppAddRequest实例，使得开发者可以轻松访问应用的名称、描述、图标、类型和评分策略等详细信息。
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
@Data
public class AppAddRequest implements Serializable {


    /**
     * 应用名
     */
    private String appName;

    /**
     * 应用描述
     */
    private String appDesc;

    /**
     * 应用图标
     */
    private String appIcon;

    /**
     * 应用类型（0-得分类，1-测评类）
     */
    private Integer appType;

    /**
     * 评分策略（0-自定义，1-AI）
     */
    private Integer scoringStrategy;


    private static final long serialVersionUID = 1L;
}