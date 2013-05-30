(ns clj-gae.core
  (:require [appengine-magic.core :as ae]))

(defn dummy-app-handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body (str "Hello clj on AppEngine!"
              "\n\n"
              " [powered by AppEngine and clojure]")})

(ae/def-appengine-app dummy-app #'dummy-app-handler)

(comment
  ;; start server
  (ae/serve dummy-app :port 8082)
  ;; stop server
  (ae/stop))
