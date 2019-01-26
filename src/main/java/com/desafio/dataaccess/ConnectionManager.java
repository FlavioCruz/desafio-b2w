package com.desafio.dataaccess;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;

public class ConnectionManager {
    private static ConnectionManager _connectionManager = null;

    private ConnectionManager(){
    }

    public static ConnectionManager getInstance(){
        if(_connectionManager == null){
            _connectionManager = new ConnectionManager();
        }
        return _connectionManager;
    }
}
