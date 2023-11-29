## 本项目实现的最终作用是基于JSP美食资讯网站平台系统
## 分为2个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 修改个人信息
 - 发表帖子
 - 按分类查看
 - 查看我的发帖
 - 管理员登录
### 第2个角色为用户角色，实现了如下功能：
 - 修改个人信息
 - 按分类查看
 - 提交帖子
 - 查看帖子
 - 查看我的发帖
 - 用户登录
## 数据库设计如下：
# 数据库设计文档

**数据库名：** wzpt_sys

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [collection](#collection) |  |
| [comment](#comment) | 评价表 |
| [invite](#invite) |  |
| [post](#post) |  |
| [user](#user) | 用户表 |

**表名：** <a id="collection">collection</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | collection_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | user_id |   int   | 10 |   0    |    N     |  N   |       | 用户ID  |
|  3   | post_id |   int   | 10 |   0    |    N     |  N   |       |   |
|  4   | time |   varchar   | 255 |   0    |    N     |  N   |       | 时间日期  |

**表名：** <a id="comment">comment</a>

**说明：** 评价表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | comment_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | post_id |   int   | 10 |   0    |    N     |  N   |       |   |
|  3   | user_id |   int   | 10 |   0    |    N     |  N   |       | 用户ID  |
|  4   | content |   varchar   | 20000 |   0    |    N     |  N   |       | 内容  |
|  5   | time |   varchar   | 255 |   0    |    N     |  N   |       | 时间日期  |
|  6   | agree |   int   | 10 |   0    |    N     |  N   |   0    |   |

**表名：** <a id="invite">invite</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | ID  |
|  2   | fromuser |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | touser |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | postid |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | time |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="post">post</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | post_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | user_id |   int   | 10 |   0    |    N     |  N   |       | 用户ID  |
|  3   | post_time |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | hot |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  5   | src |   varchar   | 120 |   0    |    N     |  N   |       |   |
|  6   | type |   varchar   | 255 |   0    |    N     |  N   |   '学习'    |   |
|  7   | title |   varchar   | 255 |   0    |    N     |  N   |       | 标题  |

**表名：** <a id="user">user</a>

**说明：** 用户表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | user_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | user_name |   varchar   | 255 |   0    |    N     |  N   |       | 用户名  |
|  3   | password |   varchar   | 255 |   0    |    N     |  N   |       | 密码  |
|  4   | nickname |   varchar   | 256 |   0    |    N     |  N   |       |   |
|  5   | sex |   varchar   | 255 |   0    |    N     |  N   |   '未知'    |   |
|  6   | birthday |   varchar   | 255 |   0    |    N     |  N   |   '1990-1-1'    |   |
|  7   | user_icon |   varchar   | 120 |   0    |    N     |  N   |   'default.ico'    |   |
|  8   | email |   varchar   | 120 |   0    |    N     |  N   |       | 邮箱  |
|  9   | reg_time |   varchar   | 255 |   0    |    N     |  N   |       |   |

**运行不出来可以微信 javape 我的公众号：源码码头**
