(defproject techascent/tech.jna "3.24"
  :description "Bindings of tech.datatype system to jna."
  :url "http://github.com/tech-ascent/tech.jna"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-tools-deps "0.4.1"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]})
