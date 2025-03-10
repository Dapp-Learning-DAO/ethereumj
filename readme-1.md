
## 常用命令
```
java -jar -Dethereumj.conf.res=config/node1.conf ethereumj-core/build/libs/ethereumj-core-*-all.jar

./gradlew clean fatJar

export JAVA_HOME=/Users/***/Library/Java/JavaVirtualMachines/corretto-1.8.0_382/Contents/Home

```


## 源码解读

在EthereumJ的samples里面，提供了很多的例子，使用EthereumFactory的createEthereum()来加载Spring的Application Context。
Spring通过加载EthereumJ定义的DefaultConfig和CommonConfig来加载EthereumJ的其它模块。
EthereumJ除了在这两个类里创建的多个spring beans，在CommonConfig里通过Spring的ComponentScan的功能创建了EthereumJ定义的多个Components，Services。

1. 最底层的DataSource提供了数据的persistence。数据采用的是<key, value>格式，以byte的形式保存，缺省使用的是Facebook的RocksDB。
2. Blockchain Management实现了以太坊定义的Trie node，Transaction，Block，Block
chain等数据结构，以及这些数据结构的管理功能。
3.  P2P Network实现了以太坊定义的devp2p协议，实现了以太坊的网络的，nodes之间的发现和nodes之间的通信功能。
4.  Sync Management，实现了以太坊网络nodes之间同步blocks/Transactions的功能。
5. Block Mining实现了Ethash协议定义的block生成以及产生共识的功能。
6.  Program/VM实现了Solidity的compile和prgram的执行功能。


### P2P Network

### DataSource & Trie tree

### POW  Mining

### Sync Management

### Blockchain Management

### EVM 




## 参考资料：

状态存储:  https://learnblockchain.cn/article/4889

MPT: https://learnblockchain.cn/books/geth/part3/mpt.html