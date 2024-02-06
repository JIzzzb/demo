# NoteBook

1、k8s ingress域名，service域名，nginx server_name之间的关系

service中包含很多负载，负载有内部域名，service通过内部域名访问各个pod,外界无法直接访问service，外界通过ingress（配置外部域名）访问到service，service到各个负载

user->ingress(out domain name) ->service(internal domain name)->deplyment(nginx)

nginx servername = ingress domain name

2、编程思想：

- 只传必要的方法参数
- 调用方法返回出来的对象参数名称明确，简洁
- 要具有高内聚性
- log信息要简洁