package com.test

class MvnBuild implements Serializable {
   def script
   def folder

	MvnBuild(script){
		this.script=script
	}

	def clean(){
		script.sh """echo Muzammil"""
		script.sh """mvn 'clean'"""
	}
	def install(){
		script.sh """mvn 'install'"""
	}
	def build(){
		clean()
		install()
	}
}
