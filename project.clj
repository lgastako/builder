(defproject builder "0.1.0-SNAPSHOT"
  :description "reality builder"
  :url "http://github.com/lgastako/builder"
  :dependencies [[devcards                  "0.2.1"]
                 [its-log                   "3.0.0"]
                 [org.clojure/clojure       "1.7.0"]
                 [org.clojure/clojurescript "1.7.189"]
                 ;; [org.clojure/core.async    "0.2.374"]
                 [org.omcljs/om             "0.9.0"]
                 [prismatic/dommy           "1.1.0"]
                 [prismatic/om-tools        "0.4.0"]
                 [sablono                   "0.5.0"]]
  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-1"]]
  :clean-targets ^{:protect false} ["resources/public/js/compiled"
                                    "target"]
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
