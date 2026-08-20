# Steal My Brainrot

Playable mobile prototype / beta project.

## Current project state

- Version: **0.70.0-beta-rc1**
- Android versionCode: **700**
- Local HTML/WebView gameplay
- Resource harvesting and respawn
- Harvest XP + levels
- Backpack / base storage
- Crafting and upgrades
- Boss/event encounters
- NPC theft/raids tuned to be less aggressive
- Raid protection / cooldown
- Shop and base windows with working close controls
- Larger scrolling world
- Mobile controls
- Simple generated menu music and SFX

## Test in a browser

Open:

`app/src/main/assets/index.html`

No server is required.

## Build Android with GitHub Actions

Push this project to the `main` branch. Then open:

**GitHub → Actions → Android Build**

After a successful run, download:

- `steal-my-brainrot-debug-apk`
- `steal-my-brainrot-release-aab`

The release AAB produced here is unsigned and intended as a build artifact. A Play Store production release still needs signing/keystore setup.

## Local Android build

Requires Android SDK + Gradle.

```bash
gradle :app:assembleDebug
```

## Controls

- Mobile: on-screen joystick
- Desktop: WASD / Arrow keys
- Walk close to resources and tap **HARVEST**
- Use **BASE**, **CRAFT**, and **SHOP** from the HUD
