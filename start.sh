#!bin/sh
nohup java -jar ${env.WORKSPACE}/target/${JAR_NAME} > /root/pipeline.log 2>&1 &
