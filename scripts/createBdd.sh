#!/bin/bash
echo "Hello"
sudo docker run --rm \
    imega/mysql-client \    
    mysql --host=127.0.0.1 --port=3306 --user=root --password=passwordroot < scripts/mydb.sql
