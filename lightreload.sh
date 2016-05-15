#!/usr/bin/env bash

# application path in tomcat
TOMCAT_APP_BASE=/usr/local/tomcat7/webapps/notif

#define variable
ASST="assets"
WEB="web"

args=("$@")
# get length of command args
NUMBER_OF_ARGS=${#args[@]}

if [ ${NUMBER_OF_ARGS} -gt 0 ]

    then
    echo $NUMBER_OF_ARGS
        # for loop read all commands
        for (( i=0; i < ${NUMBER_OF_ARGS}; i++ ));
        do
            if [ $ASST = ${args[$i]} ]
                then
                    cp -r ./src/main/webapp/assets $TOMCAT_APP_BASE
                    echo "Reload assets"
            fi

            if [ $WEB = ${args[$i]} ]
                then
                    cp -r ./src/main/webapp/WEB-INF/* $TOMCAT_APP_BASE/WEB-INF/
                    cp -r ./src/main/resources/* $TOMCAT_APP_BASE/WEB-INF/classes/
                    echo "Reload WEB-INF"
            fi

        done

else
    echo "Command to reload assets: " $ASST
    echo "Command to reload WEB: " $WEB
fi

#/home/coder/IdeaProjects/notif/src/main/webapp
