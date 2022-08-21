import com.test.MvnBuild

def call() {
	def mvnBuild = new MvnBuild(this)
	mvnBuild.build()
}
