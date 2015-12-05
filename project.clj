(defproject builder "0.1.0-SNAPSHOT"
  :description "reality builder"
  :url "http://github.com/lgastako/builder"
  :dependencies [[cljsjs/react              "0.14.3-0"]
                 [cljsjs/react-dom          "0.14.3-1"]
                 [cljsjs/react-dom-server   "0.14.3-0"]
                 [devcards                  "0.2.1"]
                 [its-log                   "3.0.0"]
                 [leiningen                 "2.5.3"
                  :exclusions [commons-codec
                               commons-logging
                               org.apache.httpcomponents/httpclient
                               org.apache.maven.wagon/wagon-provider-api
                               org.codehaus.plexus/plexus-utils]]
                 [org.clojure/clojure       "1.7.0"]
                 [org.clojure/clojurescript "1.7.189"]
                 [org.clojure/core.async    "0.2.374"]
                 ;; [org.clojure/tools.reader  "1.0.0-alpha1"]
                 [org.omcljs/om             "0.9.0"]
                 [prismatic/dommy           "1.1.0"]
                 [prismatic/om-tools        "0.4.0"]
                 [ring/ring-core            "1.4.0"]
                 [sablono                   "0.5.0"]]
  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-1"
             :exclusions [org.clojure/tools.reader
                          ring/ring-core]]]
  :clean-targets ^{:protect false} ["resources/public/js/compiled"
                                    "target"]
  :min-lein-version "2.5.3"
  :source-paths ["src"]
  :figwheel {:css-dirs ["resources/public/css"]}
  :cljsbuild {:builds [{:id "devcards"
                        :source-paths ["src"]
                        :figwheel {:devcards true}
                        :compiler {:main       "builder.core"
                                   :asset-path "js/compiled/devcards_out"
                                   :output-to  "resources/public/js/compiled/builder_devcards.js"
                                   :output-dir "resources/public/js/compiled/devcards_out"
                                   :source-map-timestamp true}}
                       {:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main       "builder.core"
                                   :asset-path "js/compiled/out"
                                   :output-to  "resources/public/js/compiled/builder.js"
                                   :output-dir "resources/public/js/compiled/out"
                                   :source-map-timestamp true}}
                       {:id "prod"
                        :source-paths ["src"]
                        :compiler {:main       "builder.core"
                                   :asset-path "js/compiled/out"
                                   :output-to  "resources/public/js/compiled/builder.js"
                                   :optimizations :advanced}}]})
