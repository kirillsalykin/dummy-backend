(ns backend
  (:require [org.httpkit.server :as server]))

(defn handler [req]
  (if (contains? #{"/readyz" "/livez"} (:uri req))
    ;; K8s
    {:status  200
     :headers {}
     :body    "foo"}

    {:status  500
     :headers {}
     :body    "I am not working"}))

(defn main []
  (server/run-server handler
                     {:ip "0.0.0.0"
                      :port 8800})
  (deref (promise)))

(main)
