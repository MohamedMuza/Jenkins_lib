import com.test

def call() {
	def mvnbuild = new MvnBuild(this)
	mvnbuild.build()
}
