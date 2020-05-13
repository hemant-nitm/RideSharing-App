package com.hemant.ridesharing.data.network

import com.hemant.ridesharing.simulator.WebSocket
import com.hemant.ridesharing.simulator.WebSocketListener

class NetworkService {
    fun createWebSocket(webSocketListener: WebSocketListener): WebSocket{
        return WebSocket(webSocketListener)

    }


}