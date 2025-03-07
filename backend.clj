(ns backend
  (:require [org.httpkit.server :as server]))

(defn handler [req]
  (if (contains? #{"readyz" "livez"} (:path req))
    ;; K8s
    {:status  200
     :headers {}
     :body    "foo"}

    {:status  200
     :headers {}
     :body    "foo"}))

(defn main []
  (server/run-server handler
                     {:ip "0.0.0.0"
                      :port 8800})
  (deref (promise)))

(main)
