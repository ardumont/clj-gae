(ns clj-gae.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use [testgae.core])
  (:require [appengine-magic.servlet :as servlet]))

(defn -service [this request response]
  ((servlet/make-servlet-service-method twitalyse-app) this request response))
