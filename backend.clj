(ns backend
  (:require [org.httpkit.server :as server]))

(defn handler [req]
  {:status  200
   :headers {}
   :body    "boo1"})

(defn main []
  (server/run-server handler
                     {:ip "0.0.0.0"
                      :port 8800})
  (deref (promise)))

(main)
