import com.test.MvnBuild

def call() {
	def mvnbuild = new MvnBuild(this)
	mvnBuild.build()
}
