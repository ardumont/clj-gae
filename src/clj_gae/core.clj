(ns clj-gae.core
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use compojure.core
        [ring.util.servlet   :only [defservice]]
        [ring.util.response  :only [redirect]]
        [hiccup.core         :only [h html]]
        [hiccup.page-helpers :only [doctype include-css link-to xhtml-tag]]
        [hiccup.form-helpers :only [form-to text-area text-field]])
  (:import (com.google.appengine.api.datastore Query))
  (:require [compojure.route          :as route]
            [appengine.datastore.core :as ds]
            [appengine.users          :as users]))

(defroutes public-routes
  (GET "/" [] {:status 200
               :headers {"Content-Type" "text/plain"}
               :body (str "Hello clj on AppEngine!"
                          "\n\n"
                          " [powered by AppEngine and clojure]")}))

(defservice public-routes)
