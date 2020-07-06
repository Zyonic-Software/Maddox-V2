/*
 * Zyonic Software - 2020 - Tobias Rempe
 * This File, its contents and by extention the corresponding project may be used freely in compliance with the Apache 2.0 License.
 *
 * tobiasrempe@zyonicsoftware.com
 */

package com.zyonicsoftware.maddox.core.language;

import com.zyonicsoftware.maddox.core.main.Maddox;
import de.daschi.javalanguageapi.api.LanguageAPI;
import de.daschi.javalanguageapi.api.LanguageHandler;

import java.io.File;

public class LanguageConfigFileManager {

    public void initLanguageConfig(Maddox maddox) {

        new File("languages/").mkdir();

        LanguageHandler languageHandler = new LanguageHandler(LanguageHandler.LanguageSaveMode.YAML, "languages/", "EN");
        LanguageAPI.setLanguageHandler(languageHandler);
        LanguageAPI.setLanguage("EN");

        //Help
        try {
            File file = new File("languages/EN.yml");

            if (file.createNewFile()) {
                LanguageAPI.setValue("Help-Category", "Information", "EN");
                LanguageAPI.setValue("Help-Desc", "Shows helpful Information", "EN");
                LanguageAPI.setValue("Help-Syntax", "<PREFIX>help <Command>", "EN");

                LanguageAPI.setValue("Settings-Category", "Settings", "EN");
                LanguageAPI.setValue("Language-Desc", "Command for switching Language-Settings", "EN");
                LanguageAPI.setValue("Language-Syntax", "<PREFIX>lang <Language>", "EN");
                LanguageAPI.setValue("Language-Set", "The Language for '<SERVER>' was set to '<LANGUAGE>'!", "EN");
                LanguageAPI.setValue("Language-List-Header", "Available Languages", "EN");
                LanguageAPI.setValue("Language-List-SubHeader", "A list of all available Languages:", "EN");


                LanguageAPI.setValue("SetPrefix-Desc", "This Commands enables you to choose a server-specific prefix for " + maddox.getName() + ".", "EN");
                LanguageAPI.setValue("SetPrefix-Syntax", "<PREFIX>setprefix <new Prefix>", "EN");
                LanguageAPI.setValue("SetPrefix-Set", "The Prefix for '<SERVER>' was set to '<PREFIX>' !", "EN");

                LanguageAPI.setValue("AutoRole-Desc", "This Command enables you to set up " + maddox.getName() + " to give new Users that are just now joining your Discord specefied Roles", "EN");
                LanguageAPI.setValue("AutoRole-Syntax", "<PREFIX>autorole add @Role | <PREFIX>autorole remove @Role", "EN");
                LanguageAPI.setValue("AutoRole-Response-1", "The Role <ROLE> was added to Autoroles", "EN");
                LanguageAPI.setValue("AutoRole-Response-2", "The Role <ROLE> was removed from the Autoroles", "EN");
                LanguageAPI.setValue("AutoRole-Response-3", "Please supply the needed arguments: ", "EN");

                LanguageAPI.setValue("EventMessage-Set", "The <MESSAGE-TYPE>message was set to <MESSAGE>!", "EN");
                LanguageAPI.setValue("JoinMessage", "Welcoming", "EN");
                LanguageAPI.setValue("LeaveMessage", "Leave", "EN");
                LanguageAPI.setValue("MessageEnabled", "The <MESSAGE-TYPE>message was enabled!", "EN");
                LanguageAPI.setValue("MessageDisabled", "The <MESSAGE-TYPE>message was disabled!", "EN");
                LanguageAPI.setValue("ChannelSet", "The channel for <MESSAGE-TYPE>messages was set to <CHANNEL> !", "EN");
                LanguageAPI.setValue("NoMessageProvided", "You didn't provide a message. Please provide a message like this:``<PREFIX><MESSAGE-TYPE>message set Welcome <USER>! Have fun on <SERVER>!``", "EN");
                LanguageAPI.setValue("NoChannelProvided", "You didn't provide a channel. Please mention a channel like this: ``<PREFIX><MESSAGE-TYPE>message setchannel #ChannelName`` !", "EN");
                LanguageAPI.setValue("MessageArgumentsMissing", "You didn't provide any arguments! please specify an action like this: ``<PREFIX><MESSAGE-TYPE>message set`` or ``<PREFIX><MESSAGE-TYPE>message setchannel``!", "EN");
                LanguageAPI.setValue("JoinMessage-Syntax", "``<PREFIX>joinmessage set <Your Mesage>`` | ``<PREFIX>joinmessage setchannel #YourChannel`` | ``<PREFIX>joinmessage enable`` | ``<PREFIX>joinmessage disable``", "EN");
                LanguageAPI.setValue("LeaveMessage-Syntax", "``<PREFIX>leavemessage set <Your Message>`` | ``<PREFIX>leavemessage setchannel #YourChannel`` | ``<PREFIX>leavemessage enable`` | ``<PREFIX>leavemessage disable``", "EN");
                LanguageAPI.setValue("JoinMessage-Desc", "The Joinmessage commands let you set a message that welcomes new Users to your Discord-Server. If you type <USER> within the Message " + maddox.getName() + " will mention the new Member.", "EN");
                LanguageAPI.setValue("LeaveMessage-Desc", "The Leavemessage commands let you set a message that bids farewell to users that leave your Discord-Server. If you type <USER> within the Message " + maddox.getName() + " will mention the new Member.", "EN");


                LanguageAPI.setValue("NoChange", "Nothing was Changed", "EN");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        languageHandler.setLanguage("DE");
        LanguageAPI.setLanguage("DE");

        try {
            File file = new File("languages/DE.yml");

            if (file.createNewFile()) {
                LanguageAPI.setValue("Help-Category", "Informationen", "DE");
                LanguageAPI.setValue("Help-Desc", "Zeigt hilfreiche Informationen.", "DE");
                LanguageAPI.setValue("Help-Syntax", "<PREFIX>help <command>", "DE");

                LanguageAPI.setValue("Settings-Category", "Einstellungen", "DE");
                LanguageAPI.setValue("Language-Desc", "Command um die Sprache umzustellen.", "DE");
                LanguageAPI.setValue("Language-Syntax", "<PREFIX>lang <Sprache>", "DE");
                LanguageAPI.setValue("Language-Set", "Die Sprache von '<SERVER>' wurde auf '<LANGUAGE>' gesetzt!", "DE");
                LanguageAPI.setValue("Language-List-Header", "Verfügbare Sprachen", "DE");
                LanguageAPI.setValue("Language-List-SubHeader", "Eine Liste von allen verfügbaren Sprachen:", "DE");

                LanguageAPI.setValue("SetPrefix-Desc", "Dieser Command ermöglicht es dir einen Serverspezifischen Prefix für " + maddox.getName() + " zu setzen.", "DE");
                LanguageAPI.setValue("SetPrefix-Syntax", "<PREFIX>setprefix <new Prefix>", "DE");
                LanguageAPI.setValue("SetPrefix-Set", "Der Prefix für '<SERVER>' wurde auf '<PREFIX>' gesetzt!", "DE");

                LanguageAPI.setValue("AutoRole-Desc", "Dieser Command ermöglicht es dir " + maddox.getName() + " darauf zu programmieren einem neuen Benutzer der deinem Discord Server beitritt bestimmte Rollen zu geben", "DE");
                LanguageAPI.setValue("AutoRole-Syntax", "<PREFIX>autorole add @Rolle | <PREFIX>autorole remove @Rolle", "DE");
                LanguageAPI.setValue("AutoRole-Response-1", "Die Rolle <ROLE> wurde zu den Autorollen hinzugefügt", "DE");
                LanguageAPI.setValue("AutoRole-Response-2", "Die Rolle <ROLE> wurde von den Autorollen entfernt", "DE");
                LanguageAPI.setValue("AutoRole-Response-3", "Bitte gebe die benötigten Argumente an: ", "DE");

                LanguageAPI.setValue("EventMessage-Set", "Die <MESSAGE-TYPE>nachricht wurde auf <MESSAGE> gesetzt!", "DE");
                LanguageAPI.setValue("JoinMessage", "Wilkommens", "DE");
                LanguageAPI.setValue("LeaveMessage", "Verabschiedungs", "DE");
                LanguageAPI.setValue("MessageEnabled", "Die <MESSAGE-TYPE>nachricht wurde aktiviert!", "DE");
                LanguageAPI.setValue("MessageDisabled", "Die <MESSAGE-TYPE>nachricht wurde deaktiviert!", "DE");
                LanguageAPI.setValue("ChannelSet", "Der Kanal für <MESSAGE-TYPE>nachrichten wurde auf <CHANNEL> gesetzt!", "DE");
                LanguageAPI.setValue("NoMessageProvided", "Du hast keine Nachricht angegeben! Bitte gebe eine Nachricht an:``<PREFIX><MESSAGE-TYPE>message set Wilkommen <USER>! Hab Spaß auf <SERVER>!``", "DE");
                LanguageAPI.setValue("NoChannelProvided", "Du hast keinen Kanal angegeben! Bitte tagge einen Kanal: ``<PREFIX><MESSAGE-TYPE>message setchannel #ChannelName`` !", "DE");
                LanguageAPI.setValue("MessageArgumentsMissing", "Du hast keine Argumente angegeben! bitte gebe entweder ``<PREFIX><MESSAGE-TYPE>message set`` oder ``<PREFIX><MESSAGE-TYPE>message setchannel`` ein!", "DE");
                LanguageAPI.setValue("JoinMessage-Syntax", "``<PREFIX>joinmessage set <Deine Nachricht>`` | ``<PREFIX>joinmessage setchannel #DeinKanal`` | ``<PREFIX>joinmessage enable`` | ``<PREFIX>joinmessage disable``", "DE");
                LanguageAPI.setValue("LeaveMessage-Syntax", "``<PREFIX>leavemessage set <Deine Nachricht>`` | ``<PREFIX>leavemessage setchannel #DeinKanal`` | ``<PREFIX>leavemessage enable`` | ``<PREFIX>leavemessage disable``", "DE");
                LanguageAPI.setValue("JoinMessage-Desc", "Der Joinmessage Command lässt dich eine Nachricht erstellen die die User auf deinem Discord wilkommen heißt. Indem du in deiner Nachricht <USER> schreibst erwähnst du neue Benutzer", "DE");
                LanguageAPI.setValue("LeaveMessage-Desc", "Der Leavemessage Command lässt dich eine Nachricht erstellen die die User von deinem Discord verabschiedet. Indem du in deiner Nachricht <USER> schreibst erwähnst du neue Benutzer", "DE");


                LanguageAPI.setValue("NoChange", "Nichts verändert", "DE");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        languageHandler.setLanguage(maddox.getDefaultLanguage());
        LanguageAPI.setLanguage(maddox.getDefaultLanguage());
    }
}
