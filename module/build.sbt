name := "play20.auth"

version := "0.3-SNAPSHOT"

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  Resolver.file("Local Play Repo", file("../../Play20/repository/local"))(Resolver.ivyStylePatterns)
)

libraryDependencies ++= Seq(
  "play" %% "play" % "2.1-SNAPSHOT"
)

organization := "jp.t2v"

publishTo := sys.env.get("LOCAL_MAVEN_REPO").map { dir =>
  Resolver.file("maven-repo", file(dir))(Patterns(true, Resolver.mavenStyleBasePattern))
}
