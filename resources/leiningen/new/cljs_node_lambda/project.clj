(defproject cljs-node-lambda "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.597"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-npm "0.6.2"]]

  :npm {:dependencies [[source-map-support "0.5.16"]]}

  :source-paths ["src"]

  :cljsbuild {:builds [{:id "{{sanitized}}"
                        :source-paths ["src"]
                        :compiler {:main {{sanitized}}.main
                                   :output-to "index.js"
                                   :target :nodejs
                                   :optimizations :simple}}]})
