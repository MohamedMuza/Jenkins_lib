import com.test.MvnBuild

def call() {
	def mvnbuild = new MvnBuild(this)
	mvnbuild.build()
}
