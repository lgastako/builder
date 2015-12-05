(ns builder.core
  (:require [builder.app :as app]
            [builder.views.main :as main]
            [dommy.core :refer-macros [sel1]]
            [its.log :as log]
            [om.core :as om :include-macros true]
            [sablono.core :refer-macros [html]]))

(log/set-level! :debug)
(log/debug ::begin)

(defn main []
  (when-let [node (sel1 :#app)]
    (om/root main/view app/state {:target node})))

(main)

(log/debug ::end)
