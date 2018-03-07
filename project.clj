(defproject my-exercise. "0.1.0-SNAPSHOT"
  :description "An anonymous Democracy Works coding exercise"
  :min-lein-version "2.7.1"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.6.3"]
                 [http-kit "2.1.18"]
                 [ring/ring-defaults "0.3.1"]
                 [compojure "1.6.0"]
                 [hiccup "1.0.5"]
                 [org.clojure/data.json "0.2.6"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.1.5"]]
  :plugins [[lein-ring "0.12.1"]]
  :main my_exercise.core
  :ring {:handler my-exercise..core/handler}
  :aliases {"submit" ["run" "-m" "my-exercise..submit"]})
