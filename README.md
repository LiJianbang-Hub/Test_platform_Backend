优测智能测试平台 
项目描述：基于 Spring Boot + Redis + ChatGLM + RxJava + SSE (+Vue3+ Arco Design + Pinia）的智能测试平台。用户可以通过 AI 快速生成题目并制作应用，经管理员审核后，用户可在线答题，并通过多种评分算法或 AI 获取答题总结；管理员可以集中管理平台内容，并进行数据统计与分析。
工作：（1）库表设计：根据业务需求，设计了用户、应用、题目、评分结果和答题记录表。题目表使用 JSON 存储复杂的嵌套题目和选项，便于维护和扩展。
（2）使用策略模式实现多种评分算法（如统计得分、AI 评分等），全局执行器通过扫描策略类的自定义注解来选择执行策略，避免了传统的 if-else 结构，增强了系统的扩展性。
（3）封装了 ChatGLM 的通用 AI 服务，通过配置类自动加载 API 密钥并初始化 AI 客户端，方便全局访问。同时由于 AI 生成题目较慢，选用流式 API 并通过 SSE 实时推送单道题目给前端，提高用户体验。
（4）利用 RxJava 的操作符链式处理 AI 异步数据流，通过 map 处理字符串、 filter 过滤空值、 flatMap 映射串为单个字符，再通过括号平衡算法拼接出单道题目，使逻辑简单清晰。
（5）使用 Caffeine 缓存答案的 AI 评分结果，大幅提高评分性能（从 10s 降至 5ms）并节省成本，同时通过 Redisson 分布式锁防止缓存击穿。
（6）基于Vue3+Arco Design组件库快速构建界面，自主实现在线答题、应用检索和管理、应用创建、统计分析等10+页面。
项目展示：
![image](https://github.com/user-attachments/assets/e5a20416-6790-4e4d-b4fc-654206c3977e)
![image](https://github.com/user-attachments/assets/49aafe80-f4d5-4d2b-bcb1-ee860ea81a8b)
![image](https://github.com/user-attachments/assets/b515e0d2-30b0-4b4c-bcba-bbf42760898f)
![image](https://github.com/user-attachments/assets/3d337dcb-bcb9-4c52-a62c-6ddaa2ef50dd)
![image](https://github.com/user-attachments/assets/04b045fd-aa5b-4125-ac94-12067872eebc)
![image](https://github.com/user-attachments/assets/d5351e00-7555-44ef-8410-3331e6d3e64f)
![image](https://github.com/user-attachments/assets/9bd0299a-8d6a-4c8d-90aa-9971309a485f)
![image](https://github.com/user-attachments/assets/af18f972-e77f-4974-88b0-faa4aec51fef)
![image](https://github.com/user-attachments/assets/cb4ac4ce-8d4a-4f12-ae6a-6ccb53249723)
![image](https://github.com/user-attachments/assets/d6b4f743-1e83-4104-8427-1a5e295b0e0f)
![image](https://github.com/user-attachments/assets/8dc46559-db7e-406d-b3fe-9acd12371de4)
![image](https://github.com/user-attachments/assets/e36ce57a-d8c2-4512-9698-a5e2a60e6690)
![image](https://github.com/user-attachments/assets/d02d44ba-7940-4174-a772-016dd13dfeee)
![image](https://github.com/user-attachments/assets/28b9f17f-aeab-4b69-b70e-01b5bdfb32ab)






