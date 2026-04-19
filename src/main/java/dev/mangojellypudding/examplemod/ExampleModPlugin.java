package dev.mangojellypudding.examplemod;

import com.tkisor.nekojs.api.NekoJSPlugin;
import com.tkisor.nekojs.api.annotation.RegisterNekoJSPlugin;
import com.tkisor.nekojs.api.data.JSTypeAdapterRegister;
import com.tkisor.nekojs.api.data.BindingsRegister;
import com.tkisor.nekojs.api.event.EventGroupRegistry;
import com.tkisor.nekojs.api.recipe.RecipeNamespaceRegister;
import com.tkisor.nekojs.script.prop.ScriptPropertyRegistry;
import lombok.NoArgsConstructor;

@RegisterNekoJSPlugin
@NoArgsConstructor
public class ExampleModPlugin implements NekoJSPlugin {
    @Override
    public void registerEvents(EventGroupRegistry registry) {}

    @Override
    public void registerClientEvents(EventGroupRegistry registry) {}

    @Override
    public void registerBindings(BindingsRegister registry) {}

    @Override
    public void registerClientBindings(BindingsRegister registry) {}

    @Override
    public void registerAdapters(JSTypeAdapterRegister registry) {}

    @Override
    public void registerRecipeNamespaces(RecipeNamespaceRegister registry) {}

    @Override
    public void registerScriptProperty(ScriptPropertyRegistry registry) {}
}
