type AspectRatio = 'AR_ASPECT_FIT_PARENT' | 'AR_ASPECT_FILL_PARENT' | 'AR_ASPECT_WRAP_CONTENT' | 'AR_MATCH_PARENT' | 'AR_16_9_FIT_PARENT' | 'AR_4_3_FIT_PARENT';

declare const GPlayer: {
  play: (url: string) => void;
  setTitle?: (title: string) => void;
  setFullScreenOnly?: (isFullScreenOnly :boolean) => void;
  setShowTopBar?: (isShowTopbar: boolean) => void;
  setAspectRatio?: (aspectRatio: AspectRatio) => void;
}

export default GPlayer;
