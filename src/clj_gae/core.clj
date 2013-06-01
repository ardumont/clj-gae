(ns clj-gae.core
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use [compojure.core]
        [ring.util.servlet   :only [defservice]]
        [ring.util.response  :only [redirect]])
  (:import (com.google.appengine.api.datastore Query))
  (:require [compojure.route          :as route]
            [appengine.datastore.core :as ds]
            [appengine.users          :as users]))
(comment
  (defroutes public-routes
    (GET "/hello" [] {:status 200
                      :headers {"Content-Type" "text/plain"}
                      :body (str "Hello clj on AppEngine!"
                                 "\n\n"
                                 " [powered by AppEngine and clojure]")}))

  (defservice public-routes))
