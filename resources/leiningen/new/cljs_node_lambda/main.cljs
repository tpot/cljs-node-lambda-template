(ns lambda.main
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn handler
  [event context callback]
  (println "Executing handler, event =" event)
  (callback nil #js {:statusCode 200 :body "Hello from cljs-node-lambda!"}))

(set! (.-exports js/module) #js {:handler handler})
