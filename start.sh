#!bin/sh
echo $1
nohup java -jar $1 > /root/pipeline.log 2>&1 &
