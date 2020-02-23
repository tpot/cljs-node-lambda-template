(ns leiningen.new.cljs-node-lambda
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cljs-node-lambda"))

(defn cljs-node-lambda
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' cljs-node-lambda project.")
    (->files data
             ["Makefile" (render "Makefile" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/main.cljs" (render "main.cljs" data)])))
