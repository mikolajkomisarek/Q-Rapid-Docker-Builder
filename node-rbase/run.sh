#!/bin/sh
echo "starting R..."
/usr/bin/R -e '.libPaths( "/home/ruser/libs"); if(!require(Rserve)){install.packages("Rserve", repos="https://cloud.r-project.org"); library(Rserve); }; if(!require(prophet)){install.packages("prophet", repos="https://cloud.r-project.org"); library(prophet); }; if(!require(forecast)){install.packages("forecast", repos="https://cloud.r-project.org"); library(forecast); }; if(!require(elastic)){install.packages("elastic", repos="https://cloud.r-project.org"); library(elastic); }; if(!require(forecastHybrid)){install.packages("forecastHybrid", repos="https://cloud.r-project.org"); library(forecastHybrid); }; Rserve::run.Rserve(remote=TRUE)'

