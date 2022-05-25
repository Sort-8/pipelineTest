#!bin/sh
kpid=$(lsof -i tcp:9090 -t)
if [ ${#kpid}>0 ]
then
	kill -9 $kpid
	echo "杀掉进程成功"
else
	echo "没有该进程"
fi
