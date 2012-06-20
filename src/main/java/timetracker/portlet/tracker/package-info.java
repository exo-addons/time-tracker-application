@Bindings(
        @Binding(value = org.exoplatform.services.jcr.RepositoryService.class, implementation=GateInMetaProvider.class)
)

@Assets(
        scripts = {
                @Script(src = "js/jquery-1.7.1.min.js")
        }
)

@Application
@Portlet package timetracker.portlet.tracker;

import juzu.Application;
import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Script;
import juzu.plugin.binding.Binding;
import juzu.plugin.binding.Bindings;
import juzu.plugin.portlet.Portlet;
import timetracker.integration.GateInMetaProvider;

