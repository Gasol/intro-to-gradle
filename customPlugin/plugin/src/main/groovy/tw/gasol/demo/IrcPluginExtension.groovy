package tw.gasol.demo

import org.gradle.api.*

class IrcPluginExtension {
    def server = "irc.freenode.net"
    def name = "gradleBot"
    def channel = "#twjug"

    IrcPluginExtension() {
    }

    void send(String message) {
        def bot = new MyBot()
        bot.setName(this.name)
        bot.setVerbose(true)
        bot.connect(this.server)
        bot.joinChannel(this.channel)
        bot.sendMessage(this.channel, message)
        while (bot.getOutgoingQueueSize() > 0) {
            System.sleep(500)
        }
        bot.disconnect()
    }
}
