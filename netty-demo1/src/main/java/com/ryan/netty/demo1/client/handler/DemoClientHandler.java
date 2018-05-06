package com.ryan.netty.demo1.client.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 客户端业务逻辑
 * @author lr
 * @date 2018/5/5.
 */
public class DemoClientHandler extends SimpleChannelInboundHandler {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("Server say : " + msg.toString());
    }
}