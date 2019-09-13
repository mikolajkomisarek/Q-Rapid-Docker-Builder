FROM ubuntu:16.04

RUN apt-get -y update && apt-get -y upgrade && apt-get -y dist-upgrade

RUN apt-get -y install apt-transport-https
RUN echo 'deb https://cran.r-project.org/bin/linux/ubuntu xenial/' >> /etc/apt/sources.list.d/cran.list
RUN apt-key adv --keyserver  hkp://p80.pool.sks-keyservers.net:80 --recv-keys E084DAB9
RUN apt-get update
RUN apt-get install -y libssl-dev libcurl4-openssl-dev r-base

RUN /usr/bin/R -e '.libPaths( "/home/ruser/libs"); if(!require(Rserve)){install.packages("Rserve", repos="https://cloud.r-project.org"); library(Rserve); }; if(!require(prophet)){install.packages("prophet", repos="https://cloud.r-project.org"); library(prophet); }; if(!require(forecast)){install.packages("forecast", repos="https://cloud.r-project.org"); library(forecast); }; if(!require(elastic)){install.packages("elastic", repos="https://cloud.r-project.org"); library(elastic); }; if(!require(forecastHybrid)){install.packages("forecastHybrid", repos="https://cloud.r-project.org"); library(forecastHybrid); };'

COPY . /usr/local/src/app
WORKDIR /usr/local/src/app

ENTRYPOINT R -e 'Rserve::run.Rserve(remote=TRUE)'
