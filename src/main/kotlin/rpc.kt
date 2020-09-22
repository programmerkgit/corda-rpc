import net.corda.client.rpc.CordaRPCClient
import net.corda.client.rpc.CordaRPCClientConfiguration
import net.corda.core.utilities.NetworkHostAndPort


fun main() {
//    val configuration = CordaRPCClientConfiguration(
//        Duration.ofMinutes(3),
//        4,
//        Boolean.getBoolean("net.corda.client.rpc.trackRpcCallSites"),
//        Duration.ofSeconds(1),
//        4,
//        1,
//        Duration.ofSeconds(5),
//        1,
//        10,
//        10485760,
//        Duration.ofDays(1)
//    )
    val username = "user1"
    val password = "test"
    val rpcPort = 10009
    val client = CordaRPCClient(NetworkHostAndPort("localhost", rpcPort))
    val rpcConnection = client.start(username, password)
    val proxy = rpcConnection.proxy
    println(proxy.nodeInfo().legalIdentities.first().name)
}