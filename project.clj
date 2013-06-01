(defproject clj-gae "1.0.0-SNAPSHOT"
  :description "Some dummy app to test clojure/compojure/hiccup on Google App Engine."
  :aot [cljgae.core]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "0.4.0-RC3"]
                 [ring/ring-servlet "0.2.1"]
                 [hiccup "0.2.4"]
                 [appengine "0.2"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.3.4"]
                 [com.google.appengine/appengine-api-labs "1.3.4"]]
  :dev-dependencies [[ring/ring-jetty-adapter "0.2.0"]
                     [com.google.appengine/appengine-local-runtime "1.3.4"]
                     [com.google.appengine/appengine-api-stubs "1.3.4"]]
  :repositories {"maven-gae-plugin" "http://maven-gae-plugin.googlecode.com/svn/repository"}
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib")
