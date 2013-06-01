#!/bin/bash -xe

lein clean

lein compile

appcfg.sh update war
